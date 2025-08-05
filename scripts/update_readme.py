import requests
from datetime import datetime
import os

HANDLE = os.getenv("CF_USERNAME", "patilmadhuram")
README_FILE = "README.md"
MAX_PROBLEMS = 5

def fetch_recent_submissions(handle):
    url = f"https://codeforces.com/api/user.status?handle={handle}&from=1&count=20"
    response = requests.get(url)

    if response.status_code != 200:
        print("❌ Failed to fetch data from Codeforces")
        print(response.text)
        return []

    data = response.json()
    if data.get("status") != "OK":
        print("❌ API returned non-OK status")
        print(data)
        return []

    submissions = data["result"]
    problems = []
    seen = set()

    for sub in submissions:
        if sub.get("verdict") == "OK":
            name = sub["problem"]["name"]
            contest_id = sub["problem"].get("contestId", "")
            index = sub["problem"].get("index", "")
            rating = sub["problem"].get("rating", "Unknown")
            problem_url = f"https://codeforces.com/problemset/problem/{contest_id}/{index}"
            time = datetime.fromtimestamp(sub["creationTimeSeconds"]).strftime("%Y-%m-%d %H:%M")
            key = f"{contest_id}-{index}"
            if key not in seen:
                problems.append((name, problem_url, rating, "✅ Accepted", time))
                seen.add(key)
        if len(problems) >= MAX_PROBLEMS:
            break
    return problems

def update_readme(problems):
    with open(README_FILE, "r", encoding="utf-8") as f:
        content = f.read()

    start = content.find("## 📊 Last 5 Solved Problems")
    end = content.find("---", start)
    if start == -1 or end == -1:
        print("❌ Section not found in README.md!")
        return

    table = "| # | Title | Rating | Verdict | Time |\n"
    table += "| - | ----- | ------ | ------- | ---- |\n"
    for i, (title, url, rating, verdict, time) in enumerate(problems, 1):
        table += f"| {i} | [{title}]({url}) | {rating} | {verdict} | {time} |\n"

    new_content = content[:start] + "## 📊 Last 5 Solved Problems\n\n" + table + "\n" + content[end:]
    with open(README_FILE, "w", encoding="utf-8") as f:
        f.write(new_content)
    print("✅ README updated successfully.")

if __name__ == "__main__":
    recent_problems = fetch_recent_submissions(HANDLE)
    update_readme(recent_problems)

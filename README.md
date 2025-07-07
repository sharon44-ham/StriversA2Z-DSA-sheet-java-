# 🚀 JavaRunner — Striver A2Z DSA (Step 1: Basics) Setup and Problems(updating as I keep solving)

This repository contains my Java solutions for **Step 1 of the Striver A2Z DSA Sheet**, organized **topic-wise**.

Each folder contains Java programs under a specific concept, with **VS Code task automation**, **input/output redirection**, and a consistent test case format.

---
## 🔁 Input/Output Workflow (Automated)

Each Java file is written to support **multiple test cases**, using:

```java
Scanner sc = new Scanner(System.in);
int t = sc.nextInt(); // number of test cases
while (t-- > 0) {
    // your logic here
}

📝 input.txt Format

3
123
456
789

    First line: number of test cases

    Next lines: inputs for each test case

    Output gets written to output.txt using redirection

⚙️ Running Programs with tasks.json in VS Code

To automate compilation + execution with input/output redirection:

    Go to the desired .java file (say ReverseDigits.java)

    Open input.txt and add your test cases

    Hit Ctrl + Shift + B (VS Code will use tasks.json)

    Check output.txt for results

🛠️ Sample tasks.json (edit per file you're testing)

{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "Compile Java File",
      "type": "shell",
      "command": "javac",
      "args": [
        "-d",
        ".",
        "StriversA2Z_step1_basics/math_basics/ReverseDigits.java"
      ],
      "options": {
        "cwd": "${workspaceFolder}"
      }
    },
    {
      "label": "Run with Input/Output Redirection",
      "type": "shell",
      "dependsOn": "Compile Java File",
      "command": "bash",
      "args": [
        "-c",
        "java StriversA2Z_step1_basics.math_basics.ReverseDigits < StriversA2Z_step1_basics/math_basics/input.txt > StriversA2Z_step1_basics/math_basics/output.txt"
      ],
      "options": {
        "cwd": "${workspaceFolder}"
      }
    }
  ]
}

    Just swap in the correct file path and class name for whatever file you're working on.

🧠 Why This Setup?

    Keeps problems grouped by topic (clean structure)

    Easily testable with consistent I/O setup

    Saves time from manual input

    Shows how you handle test cases like a real-world dev

🔧 Tips

    Reuse input.txt/output.txt across problems

    Keep your class name and filename matching (ReverseDigits in ReverseDigits.java)

    Customize one tasks.json and just switch file paths when testing different files

**    📅 Updated regularly as I move through the sheet.
**
🤝 Contributing & Forking

Feel free to fork and use this setup for your own DSA practice. Contributions and improvements welcome!
🔥 Motivation

    “Consistency is what transforms average into excellence.”

This repo is more than just solving problems — it's about building discipline, mastering Java, and becoming interview-ready.
📍 Author: Maryala Sharanya

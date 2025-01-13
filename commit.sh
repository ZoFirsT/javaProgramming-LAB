#!/bin/bash

# ASCII art banner
echo "
 ______________________ 
|                      |
|    Git Commit Tool   |
|______________________|
"

# Get current branch name
current_branch=$(git branch --show-current)

# Show git status
echo "📂 Current Status:"
git status -s

# Get the commit message from user input
echo -e "\n✏️  Enter commit message:"
read message

# Confirm changes
echo -e "\n🔍 About to commit the following changes:"
echo "- Branch: $current_branch"
echo "- Message: $message"
echo -n "Continue? (y/n): "
read confirm

if [ "$confirm" = "y" ] || [ "$confirm" = "Y" ]; then
    # Add all changes
    echo -e "\n📦 Adding changes..."
    git add .

    # Commit with the provided message
    echo "💾 Committing changes..."
    git commit -m "$message"

    # Push to remote repository
    echo "🚀 Pushing to remote..."
    git push origin $current_branch

    echo -e "\n✅ Changes committed and pushed successfully!"
else
    echo -e "\n❌ Operation cancelled"
    exit 1
fi

import os

print("Made by Andrew Yegiayan in 2020 for Dr. Neat's class.")
link = input("Enter Link: ")
name = input("Enter Name of File: ")

with open(os.path.join('./', name + ".url"), 'w') as shortcut:
    shortcut.write('[InternetShortcut]\n')
    shortcut.write('URL=%s' % link)

print(f"File created at { os.path.join('./', name + '.url') }")
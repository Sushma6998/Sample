import os 
d=os.popen("adb devices").read()
print(d)

os.system("sudo /home/sushma/Downloads/android-cts/tools/cts-tradefed run cts")

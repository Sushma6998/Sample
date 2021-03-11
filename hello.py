import os 
d=os.popen("adb devices").read()
print(d)

os.system("./gradlew clean installDebug ")

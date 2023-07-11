string="reverse the word here"

list=string.split()

output=""
for i in reversed(list):
    output=output+ i+ " "

print(output)    
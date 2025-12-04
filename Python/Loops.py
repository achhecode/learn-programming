# FOR loop
from random import betavariate

message = "Good morning"
#
# for i in range(100):
#     if i==0:
#         print(message +" "+ str(i + 1) + "st person")
#     elif i==1:
#         print(message +" "+ str(i + 1) + "nd person")
#     elif i==2:
#         print(message +" "+ str(i + 1) + "rd person")
#     else:
#         print(message +" "+ str(i+1) + "th person")
#




# While Loop
#
# tired = False
# count = 0
# while not tired:
#     print("I'm Jumping")
#     count += 1
#     if count > 100:
#         print("I'm tired after " + str(count) + " jumps")
#         tired = True
#


for i in range(2, 100, 3):
    if(i==5 or i==8 or i==11):
        continue
    print(i)

pen_found = False

for i in range(100):
    print("Finding in drawer "+str(i+1));
    if i==4:
        pen_found = True
        print("Pen found in drawer "+str(i+1))
        break
    print("Pen not found yet")


no_of_chocolates = 10

for i in range(10):
    if i==4 or i==5 or i==6:
        print("Friend "+str(i+1)+" already have chocolates")
        continue
    print("Giving chocolate to friend "+str(i+1))


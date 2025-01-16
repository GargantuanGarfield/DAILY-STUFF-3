import random as r

num = r.randint(1,16)
list  = []

i=0
while i < num:
    list.append(i+1)
    i += 1
print("Initial: ", list)

if num == 1:
    num2 = 1
else:
    num2 = r.randrange(1, num)

properLength = len(list)
list.pop(num2-1)
print("Removed: ", list)

check = 1
if not list:
    list.append(1)
else:
    for i in list:
        if i == check:
            if len(list) != properLength:
                list.append(len(list) + 1)
                break
            check += 1
            continue
        else:
            list.insert((check-1), check)
        check += 1

print("REstored: ", list)
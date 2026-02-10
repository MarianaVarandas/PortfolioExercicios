#opção 1 - só com while
tab = 1
while (tab <= 10):
    print (f"Tabuada do {tab}")
    tab+=1
    x=1
    while (x <= 10):
        print (f"{tab} x {x} = {tab*x}")
        x+=1

#opção 2 - só com for

for tab in range (1,11):
    print(print (f"Tabuada do {tab}"))
    for x in range (1,11):
        print (f"{tab} x {x} = {tab*x}")
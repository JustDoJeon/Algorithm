

while True:
    input1, input2 = map(int, (input().split()))
    if input1 == 0 & input2 == 0:
        break
    if input2 % input1 ==0:
        print("factor")
    elif input1 % input2 == 0:
        print("multiple")
    else:
        print("neither")

s = 'abcde'

length = (int)(len(s)/2)


if len(s) % 2 != 0:
    answer = s[length]
else:
    answer = s[length-1:length+1]

print(answer)


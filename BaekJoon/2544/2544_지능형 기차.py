# 지능형 기차  브론즈 3

people_list =[]
people =0

for _ in range(4):
    off , on = map(int, input().split())
    people -= off
    people += on
    print(people)
    people_list.append(people)

print(max(people_list))
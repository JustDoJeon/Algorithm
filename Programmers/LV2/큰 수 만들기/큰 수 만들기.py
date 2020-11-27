# 큰 수 만들기 프로그래머스 LV2

# k개를 뺏을때 가장큰수가 나와야함

def solution(number, k):
    collected = []

    for (i,num) in enumerate(number):
        while collected and collected[-1] < num and k >0:
            print("!!!!")
            collected.pop()
            k -= 1

        if k ==0:
            collected += number[i:]
            break

        print("!!???!")
        collected.append(num)
    # k가 0보다 크면 collected에 1부터
    collected = collected[:-k] if k>0 else collected
    answer = "".join(collected)
    return answer
number = "4177252841"
k =4

print(solution(number,k))
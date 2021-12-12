
def solution(x):
    answer = True

    x_list = list(map(int, str(x)))
    total = sum(x_list)
    print(total)

    if x % total == 0:
        answer = True
    else:
        answer = False


    return answer


print(solution(10))
def solution(n):
    answer = 0

    n_list = list(str(n))

    n_list.sort(reverse=True)

    answer = int("".join(n_list))

    return answer


print(solution(118372))
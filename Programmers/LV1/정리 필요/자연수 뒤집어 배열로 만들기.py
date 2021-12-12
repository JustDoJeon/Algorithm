def solution(n):
    n_list = list(map(int, str(n)))

    n_list = n_list[::-1]

    answer = n_list

    return answer

print(solution(12345))
def solution(seoul):
    answer = ' '

    ans = 0
    ans = seoul.index("Kim")
    answer = '김서방은 '+str(ans) +' 에 있다'
    return answer



seoul = ["jane", "Kim"]

print(solution(seoul))
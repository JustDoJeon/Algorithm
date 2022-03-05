def solution(s)
    answer = ''

    str_list = s.split(' ')
    # print(str_list)

    for i in range(len(str_list))
        if i  != 0 
            answer += ' '
        for j in range(len(str_list[i]))
            if  j % 2 == 0
                answer += str_list[i][j].upper()
            else
                answer += str_list[i][j].lower() #lower()처리 안해줘서 테케만 통과하고 문제 오답떴었음 

    return answer
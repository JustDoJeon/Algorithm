def solution(phone_number):
    answer = ''

    length = len(phone_number)

    # print(phone_number[0:(len(phone_number)-4)])

    # a = phone_number[0:(len(phone_number) - 4)]

    answer = '*' * (length -4 )

    answer += phone_number[-4:]

    # b = phone_number[len(phone_number)-4 : len(phone_number)]

    # print(a)
    # print(b)

    return answer

print(solution("0277788888"))
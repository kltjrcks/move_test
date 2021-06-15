# -*- coding : utf-8 -*-
#핸드폰 번호 가리기
def solution(phone_number):
    answer = ''
    masking = phone_number[:(len(phone_number)-4)]
    non_masking = phone_number[len(phone_number)-4:]
    for i in range(len(masking)):
        answer = answer + '*'
    answer = answer + non_masking

    return answer


print(solution("01050627272"))
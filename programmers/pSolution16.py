# -*- coding : utf-8 -*-
# 서울에서 김서방 찾기
def solution(seoul):
    answer = ''
    kim = 0
    idx = 0
    for i in seoul:
        if i == "Kim":
            kim = idx
        idx += 1

    answer = '김서방은 {}에 있다'.format(kim)
    return answer


seoul = ["Jane", "Kim"]
print(solution(seoul))
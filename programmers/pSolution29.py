# -*- coding : utf-8 -*-
# 문자열 내 마음대로 정렬하기
def solution(string, n):
    answer = []
    sorting = dict()
    for i1 in string:
        sorting[i1[n]] = list()

    for i2 in string:
        sorting[i2[n]].append(i2)
        sorting[i2[n]].sort()

    for key, val in sorted(sorting.items()):
        answer += val

    return answer

string = ["sun", "bed", "car", 'sua']
print(solution(string, 1))
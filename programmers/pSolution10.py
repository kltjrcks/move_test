# -*- coding : utf-8 -*-
#행렬의 덧셈
def solution(arr1, arr2):
    answer = list()
    ar1_list = list()
    ar2_list = list()
    sum_list = list()

    for ar1 in arr1:
        for ar11 in ar1:
            ar1_list.append(ar11)

    for ar2 in arr2:
        for ar22 in ar2:
            ar2_list.append(ar22)

    for alsum in range(len(ar1_list)):
        sum_list.append(ar1_list[alsum] + ar2_list[alsum])

    index = 0
    tmp = list()
    for i in range(len(sum_list)):
        index += 1
        tmp.append(sum_list[i])

        if index == len(ar1):
            answer.append(tmp)
            index = 0
            tmp = list()

    return answer

arr1 = [[1,2,3], [3,4,5], [4,3,2]]
arr2 = [[5,6,7], [7,8,9], [1,2,3]]
print(solution(arr1, arr2))
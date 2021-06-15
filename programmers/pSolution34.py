# -*- coding : utf-8 -*-
# 행렬의 곱셈
def solution(arr1, arr2):
    col_list = list()
    ar2_len = len(arr2[0])

    for ar1 in arr1:
        row_list = list()

        for a2 in range(ar2_len):
            sum = 0

            for a1r in range(len(ar1)):
                sum += ar1[a1r] * arr2[a1r][a2]

            row_list.append(sum)

        col_list.append(row_list)

    return col_list

arr1 = [[1, 4], [3, 2], [4, 1]]
arr2 = [[3, 3], [3, 3]]
print(solution(arr1, arr2))
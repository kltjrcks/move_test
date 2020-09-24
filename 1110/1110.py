import sys

def split_inputNum(number):
    if number < 10:
        f = 0
        e = int(number)

    f = int(number / 10)
    e = int(number % 10)

    return f, e

def make_newNum(first, end):
    new = first + end

    f, e = split_inputNum(new)

    result = end * 10 + e

    return result

ori_number = int(sys.stdin.readline())
count = 0

number = ori_number

while(1):
    f, e = split_inputNum(number)

    new_number = make_newNum(f, e)

    count = count + 1

    if ori_number == new_number:
        print(count)
        break

    number = new_number

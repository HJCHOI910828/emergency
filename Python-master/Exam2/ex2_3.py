"""
날짜 : 2021/05/13
이름 : 김철학
내용 : 파이썬 파이썬 팩토리얼
"""

def factorial(n):

    if n <= 1:
        return 1

    return n * factorial(n-1)


if __name__ == '__main__':
    print('3! =', factorial(3))
    print('4! =', factorial(4))
    print('5! =', factorial(5))

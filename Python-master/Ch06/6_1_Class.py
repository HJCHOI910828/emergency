"""
날짜 : 2021/04/29
이름 : 김철학
내용 : 파이썬 클래스 실습하기 교재 p148
"""
from Ch06.sub1.Account import Account
from Ch06.sub1.Computer import Computer

# 객체생성
kb = Account('국민은행', '101-12-1010', '김유신', 10000)
kb.deposit(40000)
kb.withdraw(7000)
kb.show()

wr = Account('우리은행', '101-11-1911', '김춘추', 30000)
wr.deposit(10000)
wr.withdraw(5000)
wr.show()

# Computer 객체 생성
samsung = Computer('삼성', 'Intel i7', '16GB', '1TB')
imac    = Computer('애플', 'Intel i7', '32GB', '1TB')

samsung.info()
imac.info()


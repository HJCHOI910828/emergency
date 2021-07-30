"""
날짜 : 2021/04/30
이름 : 김철학
내용 : 파이썬 캡슐화 실습하기 교재 p161
"""

from Ch06.sub1.Account import Account

kb = Account('국민은행', '101-11-1091', '김유신', 30000)
kb.deposit(10000)
kb.withdraw(5000)

# 캡슐화(정보은닉)를 적용해서 취약코드를 예방
# kb.__money -= 1

kb.show()


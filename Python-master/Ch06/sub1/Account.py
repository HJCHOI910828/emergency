# 클래스 정의
class Account:
    # 속성
    def __init__(self, bank, id, name, money):
        self.__bank = bank
        self.__id = id
        self.__name = name
        self.__money = money

    # 기능
    def deposit(self, money):
        self.__money += money

    def withdraw(self, money):
        self.__money -= money

    def show(self):
        print('-----------------')
        print('은행명 :', self.__bank)
        print('계좌번호 :', self.__id)
        print('입금주 :', self.__name)
        print('현재잔액 :', self.__money)
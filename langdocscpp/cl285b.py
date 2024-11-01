class Salesperson:
    def __init__(self, id, code, sales):
        self.id = id
        self.code = code 
        self.sales = sales
        self.com = self.calc

    def __str__(self):
        return f"{self.id}    {self.code}    ${self.sales:.2f}    ${self.com:.2f}"

    def calc(self):
        if self.code == 5 or self.code == 8:
            if self.sales <= 5000:
                self.com = self.sales * .075
            else:
                self.com = 5000 * .075 + (self.sales-5000 * .025)
        elif self.code == 17:
            ...
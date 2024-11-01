from cl285b.py import Salesperson

def main():
    try:
        print("Number    Code    Sales    Commission")
        people = []
        with open("data") as file:
            for line in file:
                ldata = line.split(" ")
                id    = int(ldata[0])
                code  = int(ldata[1])
                sales = float(ldata[2])
                dude  = Salesperson(id, code, sales)
                people.append(dude)
        for sp in people:
            print(sp)
    except Exception as e:
        print("Error:", e)

if __name__ == "__main__":
    main()
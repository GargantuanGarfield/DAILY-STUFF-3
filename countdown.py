from time import sleep

def main():
    # my counting down function -- takes number and starts for loop
    # prints the number - the number of iterations. stops when it reacches 1... then waits for 0
    def countdown(num):
        for number in range(num):
            print(num-number)
            sleep(1)
        sleep(15)
        print(0)

    #getting input
    nunmber = input("GIvE ME A NUMEBR TO COUNT DOWN FORM PLSPLSPLSPSLSPLSPLS QUICKYL OR IM GONNA EXPLODE!!!!!!!\n\t")

    #input validation
    while True:
        if nunmber.isnumeric():
            #sets number to integer if its truly all numbers otherwise it repeats FOREVER FOREVER FOREver forever...
            nunmber = int(nunmber)
            print("\n\n")
            countdown(nunmber)
            break
        else:
            nunmber = input("GIvE ME A NUMEBR TO COUNT DOWN FORM PLSPLSPLSPSLSPLSPLS QUICKYL OR IM GONNA EXPLODE!!!!!!!\n\t")
    
            



if __name__ == "__main__":
    main()
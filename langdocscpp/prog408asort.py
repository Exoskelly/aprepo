def main():                                                                                                            
    try:                                         
        data = []                                         
        with open("data/prg408a.dat", 'r') as f:                                         
            lines = f.readlines()                                         
            for line in lines:                                                                                                               
                id, score = line.split(' ')                                         
                id = int(id)                                          
                score = int(score)                                                                          
    except Exception as e: 
        print("Error:", e)                                         
    pass                                         
if __name__ == "__main__":                                         
    main()        
 
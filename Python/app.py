import plates

class BarbellApp:
    barbell_weight = float(input("How much does your barbell weigh? (15 or 20kg): "))
    total_weight = float(input("What is the total weight (including the barbell): "))
    
    new_weight = (total_weight - barbell_weight) / 2
    
    print(f"You need {new_weight}kg on each side. You can achieve this by adding:")

    # calculate plates (in plates module)
    plates.calc_plates(plates.plates, new_weight)
    
    # Loop through each plate that should be added to the barbarll
    for plate in plates.plates:
        if plate.has_count():
            print(int(plate.get_count()), 'x', plate.weight, 'kg on each side.')

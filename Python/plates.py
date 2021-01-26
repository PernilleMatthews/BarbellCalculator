class WeightPlate:
    def __init__(self, weight):
        self.weight = weight
        self.count = 0

    def set_count(self, c):
        self.count = c

    def get_count(self):
        return self.count

    def has_count(self):
        if self.count > 0:
            return True
        return False


# Create weight plate objects
plate25 = WeightPlate(25)
plate20 = WeightPlate(20)
plate15 = WeightPlate(15)
plate10 = WeightPlate(10)
plate5 = WeightPlate(5)
plate3 = WeightPlate(3)
plate2half = WeightPlate(2.5)
plate2 = WeightPlate(2)
plate1half = WeightPlate(1.5)
plate1quarter = WeightPlate(1.25)
plate1 = WeightPlate(1)
platehalf = WeightPlate(0.5)

# Put plate objects into a list
plates = [plate25, plate20, plate15,
          plate10, plate5, plate3,
          plate2half, plate2, plate1half, plate1, 
          platehalf]


# Blueprint function for calculating the plate given in app.py
def calc_plates(pls, wgt):
    for p in pls:
        p.set_count(wgt // p.weight)
        wgt = wgt % p.weight


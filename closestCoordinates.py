import csv
import sys

f = open("C:\\Users\\Arun\\Desktop\\Copart\\zip_codes_states.csv", 'rb')
shortest_distance = None
shortest_distance_coordinates = None

def find_coords(c, l):
    small = sys.maxint
    firstline = True
    for a in l:
            if firstline:
                firstline = False
                continue
            if ((float(a[1])-float(c[0]))**2 + (float(a[2])-float(c[1])**2)) < small:
                    small = ((float(a[1])-float(c[0])) + (float(a[2])-float(c[1])))
    return small
count = 0
try:
    reader = csv.reader(f)
    point = ['46.76062', '-92.266038']
    print point
    '''for airport in reader:
        if count == 0:
            count += 1
            continue
        count += 1;
        if count > 10:
            break'''
    distance = find_coords(point, reader)
    print distance
    '''if distance < shortest_distance or shortest_distance is None:
        if distance != 0:
            shortest_distance = distance
            shortest_distance_coordinates = airport

    print ("Closest co-ordinates:")
    print shortest_distance_coordinates'''
finally:
    f.close()
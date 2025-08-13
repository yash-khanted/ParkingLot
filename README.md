
# Parking Lot Management application

## Requirements
- A user can create their account to store info on their parking lots
- To store information regarding the parking lot capacity like 
  - Number of spots available for scooters, bikes, cars, transport vehicles
  - prices per hour for each spot
- Capable to store vehicle info
- provide information revenue generated from the parking lot

## Models
1. Vehicle
   - id
   - registrationNumber
   - vehicleType[scooter, bike, car]
   - entryTimeStamp
   - exitTimeStamp
2. parkingLot
   - id
   - address
   - parkingSpotList
3. parkingSpot
   - id
   - vehicleType
   - pricePerHour
   - vehicleId
   - status [vacant, reserved, unusable]
4. user
   - id
   - parkingLotList
5. parkingReceipts
   - id
   - amountGenerated
   - parkingSpotId

## Analysis
Let us consider 100 users acting in realtime and each with one parking lot and 50 avalible parking spots in each lot,
would amount to 100 user records, 100 parking lots, 5000 parking spots

In a day if assume a frequency of 5 for each spot then there will be around 25000 vehicle records each with a 
parking receipt

at any time from the available 5000 spot there could be 5% of them trying to access the api then 250 requests at 
every minute
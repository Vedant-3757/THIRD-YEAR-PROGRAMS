from flask import Flask,jsonify
app=Flask(__name__)
@app.route('/prs',methods=['GET'])
def get_prs():
    prs = [
            {'ID': 1, 'Name': 'EarPhones', 'Price': 1100,'Category':'Electronics'},
            {'ID': 2, 'Name': 'TextBooks', 'Price': 1200,'Category':'Education'},
            {'ID': 3, 'Name': 'Water Bottle', 'Price': 500,'Category':'Sports'},
            {'ID': 4, 'Name': 'PS5', 'Price': 96000,'Category':'Gaming'},
            {'ID': 5, 'Name': 'Laptop', 'Price': 55000,'Category':'Electronics'}
        ] 
    return jsonify(prs)
app.run(debug=True)
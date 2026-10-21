from flask import Flask,request,jsonify
app=Flask(__name__)
product=[]
@app.route('/products',methods=['GET','POST'])
def products():
    return jsonify(product)
@app.route('/addproduct',methods=['GET','POST'])
def  addproduct():
    data=request.get_json()
    product.append(data)
    return jsonify({
        "msg":"Product added successfully!",
        "Product":data
    })
app.run(debug=True)
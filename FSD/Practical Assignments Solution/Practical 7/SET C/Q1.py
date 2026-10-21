from flask import Flask,request,jsonify
app=Flask(__name__)
students=[{"name":"vedant","marks":85},
          {"name":"kunal","marks":80},
          {"name":"datta","marks":70},
          {"name":"vaibhav","marks":35},
          {"name":"sahil","marks":30}]
@app.route('/result',methods=['GET'])
def display():
    return students
@app.route('/addresult',methods=['GET','POST'])
def calculate():
    data=request.get_json()
    name=data.get("name")
    marks=data.get("marks")
    if marks>=40:
        result="Pass"
    else:
        result="Fail"  
    return jsonify(
        {"name" :name,
                "marks":marks,
                "result":result 
                })       
app.run(debug=True)
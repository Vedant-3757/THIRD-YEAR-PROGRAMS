from flask import Flask,jsonify,request
app=Flask(__name__)
students=[]
@app.route('/student',methods=['GET','POST'])
def student():
    return jsonify(students)
@app.route('/addstudent',methods=['GET','POST'])
def addstudent():
    data=request.get_json()
    students.append(data)
    return jsonify({
        "msg":"Student added successfully!",
        "Student":data
    })
app.run(debug=True)
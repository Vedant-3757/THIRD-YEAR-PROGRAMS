from flask import Flask,render_template,request
app=Flask(__name__)
@app.route('/display',methods=['GET','POST'])
def home():
    if request.method=='POST':
        i=request.form.get('id')
        n=request.form.get('name')
        a=request.form.get('age')
        s=request.form.get('salary')
        d=request.form.get('desig')
        return f'''
            Employee ID: {i},<br>
            Employee Name: {n},<br>
            Employee Age: {a},<br>
            Employee Salary: {s},<br>
            Employee Designation: {d}
                '''
    return render_template('index.html')
app.run(debug=True)
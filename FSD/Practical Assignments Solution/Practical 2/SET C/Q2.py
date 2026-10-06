from flask import Flask,request,render_template
results=[{"name":"vedant","result":"PASS"},{"name":"kunal","result":"PASS"},{"name":"vaibhav","result":"FAIL"}]
app=Flask(__name__)
@app.route('/',methods=['GET'])
def home():
    return render_template('index.html')
@app.route('/result',methods=['GET','POST'])
def result():
    if request.method=='POST':
        name=request.form.get('name')
        for student in results:
            if student['name']==name:
                return student
app.run(debug=True)
                                    
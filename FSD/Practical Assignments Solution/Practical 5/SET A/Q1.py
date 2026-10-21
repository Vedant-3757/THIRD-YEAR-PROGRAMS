from flask import Flask,render_template,request
app=Flask(__name__)
@app.route('/getname',methods=['GET','POST'])
def getname():
    if request.method=='POST':
        n=request.form.get('name')
        return f'''Hello {n}'''
    return render_template('indexQ1.html')
app.run(debug=True)

from flask import Flask,request,render_template
app=Flask(__name__)
@app.route('/')
def home():
    return f'''
       <h1><b>Welcome to Home Page</b></h1> 
       <button><a href='/calculate'>Go to Details</a></button>   
''' 
@app.route('/calculate', methods=['GET','POST'])
def calculate():
    if request.method=='POST':
        name=request.form.get('name')
        roll=request.form.get('roll')
        fsd=int(request.form.get('fsd'))
        wad=int(request.form.get('wad'))
        cloud=int(request.form.get('cloud'))
        net=int(request.form.get('net'))

        total=fsd+wad+cloud+net
        percent=(total/400)*100
        
        if percent>=90:
            Grade =  'Grade: O'
        elif percent>=80:
            Grade =  'Grade: A+'
        elif percent>=60:
            Grade =  'Grade: B'
        elif percent>=50:
            Grade = 'Grade: C'
        elif percent>=35:
            Grade =  'Grade: P'
        else:
            Grade = 'Grade: F'

        return f"""
        <h1>Student Details</h1><br>
        <p>Student Name: {name}</p>
        <p>Roll No.: {roll}</p>
        <p>FSD Marks: {fsd}</p>
        <p>WAD Marks: {wad}</p>
        <p>CLOUD Marks: {cloud}</p>
        <p>.NET Marks: {net}</p>
        <p>Total Marks: {total} / 400</p>
        <p>Percentage: {percent}</p>
        <p>Grade: {Grade}</p>
        <a href='/'>Go to Calculation Page</a>
            """
    return render_template('index.html')
app.run(debug=True)



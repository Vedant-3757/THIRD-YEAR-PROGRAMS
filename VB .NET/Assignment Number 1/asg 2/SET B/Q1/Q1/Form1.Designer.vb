<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        DateTimePicker1 = New DateTimePicker()
        Label1 = New Label()
        Label2 = New Label()
        Label3 = New Label()
        Year = New TextBox()
        Month = New TextBox()
        Day = New TextBox()
        Button1 = New Button()
        SuspendLayout()
        ' 
        ' DateTimePicker1
        ' 
        DateTimePicker1.Location = New Point(247, 81)
        DateTimePicker1.Name = "DateTimePicker1"
        DateTimePicker1.Size = New Size(285, 27)
        DateTimePicker1.TabIndex = 0
        ' 
        ' Label1
        ' 
        Label1.AutoSize = True
        Label1.Location = New Point(516, 231)
        Label1.Name = "Label1"
        Label1.Size = New Size(41, 20)
        Label1.TabIndex = 2
        Label1.Text = " Year"
        ' 
        ' Label2
        ' 
        Label2.AutoSize = True
        Label2.Location = New Point(516, 187)
        Label2.Name = "Label2"
        Label2.Size = New Size(56, 20)
        Label2.TabIndex = 3
        Label2.Text = " Month"
        ' 
        ' Label3
        ' 
        Label3.AutoSize = True
        Label3.Location = New Point(516, 143)
        Label3.Name = "Label3"
        Label3.Size = New Size(39, 20)
        Label3.TabIndex = 4
        Label3.Text = " Day"
        ' 
        ' Year
        ' 
        Year.Location = New Point(257, 224)
        Year.Name = "Year"
        Year.Size = New Size(253, 27)
        Year.TabIndex = 5
        ' 
        ' Month
        ' 
        Month.Location = New Point(257, 180)
        Month.Name = "Month"
        Month.Size = New Size(253, 27)
        Month.TabIndex = 6
        ' 
        ' Day
        ' 
        Day.Location = New Point(257, 136)
        Day.Name = "Day"
        Day.Size = New Size(253, 27)
        Day.TabIndex = 7
        ' 
        ' Button1
        ' 
        Button1.Location = New Point(328, 280)
        Button1.Name = "Button1"
        Button1.Size = New Size(94, 29)
        Button1.TabIndex = 8
        Button1.Text = " Submit"
        Button1.UseVisualStyleBackColor = True
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(8F, 20F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(800, 450)
        Controls.Add(Button1)
        Controls.Add(Day)
        Controls.Add(Month)
        Controls.Add(Year)
        Controls.Add(Label3)
        Controls.Add(Label2)
        Controls.Add(Label1)
        Controls.Add(DateTimePicker1)
        Name = "Form1"
        Text = "Form1"
        ResumeLayout(False)
        PerformLayout()
    End Sub

    Friend WithEvents DateTimePicker1 As DateTimePicker
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Year As TextBox
    Friend WithEvents Month As TextBox
    Friend WithEvents Day As TextBox
    Friend WithEvents Button1 As Button

End Class

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
        components = New ComponentModel.Container()
        MonthCalendar1 = New MonthCalendar()
        DateTimePicker1 = New DateTimePicker()
        ProgressBar1 = New ProgressBar()
        ImageList1 = New ImageList(components)
        PictureBox1 = New PictureBox()
        CType(PictureBox1, ComponentModel.ISupportInitialize).BeginInit()
        SuspendLayout()
        ' 
        ' MonthCalendar1
        ' 
        MonthCalendar1.Location = New Point(233, 109)
        MonthCalendar1.Name = "MonthCalendar1"
        MonthCalendar1.TabIndex = 0
        ' 
        ' DateTimePicker1
        ' 
        DateTimePicker1.Location = New Point(443, 61)
        DateTimePicker1.Name = "DateTimePicker1"
        DateTimePicker1.Size = New Size(250, 27)
        DateTimePicker1.TabIndex = 1
        ' 
        ' ProgressBar1
        ' 
        ProgressBar1.Location = New Point(569, 279)
        ProgressBar1.Name = "ProgressBar1"
        ProgressBar1.Size = New Size(125, 29)
        ProgressBar1.TabIndex = 2
        ' 
        ' ImageList1
        ' 
        ImageList1.ColorDepth = ColorDepth.Depth32Bit
        ImageList1.ImageSize = New Size(16, 16)
        ImageList1.TransparentColor = Color.Transparent
        ' 
        ' PictureBox1
        ' 
        PictureBox1.Image = My.Resources.Resources.holi_festival_celebration
        PictureBox1.Location = New Point(-29, 212)
        PictureBox1.Name = "PictureBox1"
        PictureBox1.Size = New Size(674, 287)
        PictureBox1.SizeMode = PictureBoxSizeMode.CenterImage
        PictureBox1.TabIndex = 3
        PictureBox1.TabStop = False
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(8F, 20F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(800, 450)
        Controls.Add(PictureBox1)
        Controls.Add(ProgressBar1)
        Controls.Add(DateTimePicker1)
        Controls.Add(MonthCalendar1)
        Name = "Form1"
        Text = "Form1"
        CType(PictureBox1, ComponentModel.ISupportInitialize).EndInit()
        ResumeLayout(False)
    End Sub

    Friend WithEvents MonthCalendar1 As MonthCalendar
    Friend WithEvents DateTimePicker1 As DateTimePicker
    Friend WithEvents ProgressBar1 As ProgressBar
    Friend WithEvents ImageList1 As ImageList
    Friend WithEvents PictureBox1 As PictureBox

End Class

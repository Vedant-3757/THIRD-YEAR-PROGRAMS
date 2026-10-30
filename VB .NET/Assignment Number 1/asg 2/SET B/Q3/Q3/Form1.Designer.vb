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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        ContextMenuStrip1 = New ContextMenuStrip(components)
        RichTextBox1 = New RichTextBox()
        MenuStrip1 = New MenuStrip()
        ToolStripMenuItem1 = New ToolStripMenuItem()
        ToolStripMenuItem2 = New ToolStripMenuItem()
        ToolStripMenuItem3 = New ToolStripMenuItem()
        ToolStrip1 = New ToolStrip()
        btnNew = New ToolStripButton()
        btnCut = New ToolStripButton()
        btnCopy = New ToolStripButton()
        btnPaste = New ToolStripButton()
        btnUndo = New ToolStripButton()
        MenuStrip1.SuspendLayout()
        ToolStrip1.SuspendLayout()
        SuspendLayout()
        ' 
        ' ContextMenuStrip1
        ' 
        ContextMenuStrip1.ImageScalingSize = New Size(20, 20)
        ContextMenuStrip1.Name = "ContextMenuStrip1"
        ContextMenuStrip1.Size = New Size(61, 4)
        ' 
        ' RichTextBox1
        ' 
        RichTextBox1.Location = New Point(0, 0)
        RichTextBox1.Name = "RichTextBox1"
        RichTextBox1.Size = New Size(800, 450)
        RichTextBox1.TabIndex = 3
        RichTextBox1.Text = ""
        ' 
        ' MenuStrip1
        ' 
        MenuStrip1.ImageScalingSize = New Size(20, 20)
        MenuStrip1.Items.AddRange(New ToolStripItem() {ToolStripMenuItem1})
        MenuStrip1.Location = New Point(0, 0)
        MenuStrip1.Name = "MenuStrip1"
        MenuStrip1.Size = New Size(800, 28)
        MenuStrip1.TabIndex = 4
        MenuStrip1.Text = "MenuStrip1"
        ' 
        ' ToolStripMenuItem1
        ' 
        ToolStripMenuItem1.DropDownItems.AddRange(New ToolStripItem() {ToolStripMenuItem2, ToolStripMenuItem3})
        ToolStripMenuItem1.Name = "ToolStripMenuItem1"
        ToolStripMenuItem1.Size = New Size(50, 24)
        ToolStripMenuItem1.Text = " FIle"
        ' 
        ' ToolStripMenuItem2
        ' 
        ToolStripMenuItem2.Name = "ToolStripMenuItem2"
        ToolStripMenuItem2.Size = New Size(139, 26)
        ToolStripMenuItem2.Text = "Edit"
        ' 
        ' ToolStripMenuItem3
        ' 
        ToolStripMenuItem3.Name = "ToolStripMenuItem3"
        ToolStripMenuItem3.Size = New Size(139, 26)
        ToolStripMenuItem3.Text = "Format"
        ' 
        ' ToolStrip1
        ' 
        ToolStrip1.ImageScalingSize = New Size(20, 20)
        ToolStrip1.Items.AddRange(New ToolStripItem() {btnNew, btnCut, btnCopy, btnPaste, btnUndo})
        ToolStrip1.Location = New Point(0, 28)
        ToolStrip1.Name = "ToolStrip1"
        ToolStrip1.Size = New Size(800, 27)
        ToolStrip1.TabIndex = 5
        ToolStrip1.Text = "ToolStrip1"
        ' 
        ' btnNew
        ' 
        btnNew.DisplayStyle = ToolStripItemDisplayStyle.Text
        btnNew.Image = CType(resources.GetObject("btnNew.Image"), Image)
        btnNew.ImageTransparentColor = Color.Magenta
        btnNew.Name = "btnNew"
        btnNew.Size = New Size(43, 24)
        btnNew.Text = "New"
        ' 
        ' btnCut
        ' 
        btnCut.DisplayStyle = ToolStripItemDisplayStyle.Text
        btnCut.Image = CType(resources.GetObject("btnCut.Image"), Image)
        btnCut.ImageTransparentColor = Color.Magenta
        btnCut.Name = "btnCut"
        btnCut.Size = New Size(35, 24)
        btnCut.Text = "Cut"
        ' 
        ' btnCopy
        ' 
        btnCopy.DisplayStyle = ToolStripItemDisplayStyle.Text
        btnCopy.Image = CType(resources.GetObject("btnCopy.Image"), Image)
        btnCopy.ImageTransparentColor = Color.Magenta
        btnCopy.Name = "btnCopy"
        btnCopy.Size = New Size(47, 24)
        btnCopy.Text = "Copy"
        ' 
        ' btnPaste
        ' 
        btnPaste.DisplayStyle = ToolStripItemDisplayStyle.Text
        btnPaste.Image = CType(resources.GetObject("btnPaste.Image"), Image)
        btnPaste.ImageTransparentColor = Color.Magenta
        btnPaste.Name = "btnPaste"
        btnPaste.Size = New Size(47, 24)
        btnPaste.Text = "Paste"
        ' 
        ' btnUndo
        ' 
        btnUndo.DisplayStyle = ToolStripItemDisplayStyle.Text
        btnUndo.Image = CType(resources.GetObject("btnUndo.Image"), Image)
        btnUndo.ImageTransparentColor = Color.Magenta
        btnUndo.Name = "btnUndo"
        btnUndo.Size = New Size(49, 24)
        btnUndo.Text = "Undo"
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(8F, 20F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(800, 450)
        Controls.Add(ToolStrip1)
        Controls.Add(RichTextBox1)
        Controls.Add(MenuStrip1)
        MainMenuStrip = MenuStrip1
        Name = "Form1"
        Text = "Form1"
        MenuStrip1.ResumeLayout(False)
        MenuStrip1.PerformLayout()
        ToolStrip1.ResumeLayout(False)
        ToolStrip1.PerformLayout()
        ResumeLayout(False)
        PerformLayout()
    End Sub

    Friend WithEvents ContextMenuStrip1 As ContextMenuStrip
    Friend WithEvents RichTextBox1 As RichTextBox
    Friend WithEvents MenuStrip1 As MenuStrip
    Friend WithEvents ToolStripMenuItem1 As ToolStripMenuItem
    Friend WithEvents ToolStripMenuItem2 As ToolStripMenuItem
    Friend WithEvents ToolStripMenuItem3 As ToolStripMenuItem
    Friend WithEvents ToolStrip1 As ToolStrip
    Friend WithEvents btnNew As ToolStripButton
    Friend WithEvents btnCut As ToolStripButton
    Friend WithEvents btnCopy As ToolStripButton
    Friend WithEvents btnPaste As ToolStripButton
    Friend WithEvents btnUndo As ToolStripButton

End Class

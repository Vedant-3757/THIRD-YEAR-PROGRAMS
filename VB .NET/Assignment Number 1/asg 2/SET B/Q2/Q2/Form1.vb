Public Class Form1
    Private Sub CHECK_Click(sender As Object, e As EventArgs) Handles CHECK.Click
        Dim num As Integer = Val(InputBox("Enter a num: "))
        If num < 2 Then
            MessageBox.Show("Not prime")
        ElseIf num Mod 2 = 0 Then
            MessageBox.Show("Not prime")
        Else
            MessageBox.Show("Prime")
        End If
    End Sub
End Class

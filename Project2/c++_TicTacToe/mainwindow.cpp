#include "mainwindow.h"
#include "ui_mainwindow.h"

int cnt=1;
int chanc=0;
int cont=1;
char sq[3][3]={'\0'};
int tplayersc=0;
int lplcn=0;
QString tplayers[50];
QString players[3];
int player=1;
int ecnt = 0;
int start=0;
char win = '\0';
QString winners[25];
int wicn=0;
int mode = 2;
MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    this->setWindowTitle("Tic Tac Toe");
    //this->setWindowIcon();
    ui->radioButton->setVisible(0);
    ui->radioButton_2->setVisible(0);
    ui->radioButton_3->setVisible(0);
    ui->radioButton_4->setVisible(0);
    ui->label_5->setVisible(0);
    ui->lineEdit_3->setVisible(0);
    ui->lineEdit_4->setVisible(0);
    ui->pushButton_4->setVisible(0);
    ui->label_9->setVisible(0);
    ui->pushButton_5->setVisible(0);
    ui->label_10->setVisible(0);
    ui->label_7->setVisible(0);
}

MainWindow::~MainWindow()
{
    delete ui;
}

char checkwin()
{
    // ...
}
int chmv(char player1, char player2);
int cpmove(char player1, char player2)
{
    // ...
}

int chmv(char player1, char player2)
{
    // ...
}

void MainWindow::chplayer()
{
    // ...
}

void MainWindow::on_toolButton_clicked()
{
    // ...
}

void MainWindow::on_toolButton_2_clicked()
{
    // ...
}

void MainWindow::on_toolButton_3_clicked()
{
    // ...
}

void MainWindow::on_toolButton_4_clicked()
{
    // ...
}

void MainWindow::on_toolButton_5_clicked()
{
    // ...
}

void MainWindow::on_toolButton_6_clicked()
{
    // ...
}

void MainWindow::on_toolButton_7_clicked()
{
    // ...
}

void MainWindow::on_toolButton_8_clicked()
{
    // ...
}

void MainWindow::on_toolButton_9_clicked()
{
    // ...
}

void MainWindow::on_pushButton_clicked()
{
    // ...
}

void MainWindow::on_pushButton_2_clicked()
{
    // ...
}

void MainWindow::on_pushButton_3_clicked()
{
    // ...
}

void MainWindow::on_lineEdit_3_returnPressed()
{
    // ...
}

void MainWindow::on_radioButton_3_clicked()
{
    // ...
}

void MainWindow::on_radioButton_clicked()
{
    // ...
}

void MainWindow::on_radioButton_2_clicked()
{
    // ...
}

void MainWindow::on_radioButton_4_clicked()
{
    // ...
}

void MainWindow::on_pushButton_4_clicked()
{
    // ...
}

void MainWindow::on_pushButton_5_clicked()
{
    // ...
}

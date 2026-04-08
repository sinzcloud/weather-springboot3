pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "🛎 拉取代码..."
                git branch: 'main', url: 'https://github.com/sinzcloud/weather-springboot3.git'
            }
        }

        stage('Build') {
            steps {
                echo "🧱 执行 Maven 编译 & 打包..."
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Archive') {
            steps {
                echo "📦 归档构建产物..."
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "✅ 构建成功！"
        }
        failure {
            echo "❌ 构建失败，请检查日志..."
        }
    }
}
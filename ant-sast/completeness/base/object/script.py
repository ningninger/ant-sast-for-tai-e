import os
import shutil

def create_options_yml(java_file_path, java_file_name):
    # 创建 options.yml 的内容
    options_yml_content = f"""optionsFile: null
printHelp: false
classPath: []
appClassPath:
  - {java_file_path}
mainClass: {java_file_name}
inputClasses: []
javaVersion: 8
prependJVM: false
allowPhantom: true
worldBuilderClass: pascal.taie.frontend.soot.SootWorldBuilder
outputDir: output
preBuildIR: false
worldCacheMode: false
scope: APP
nativeModel: true
planFile: null
analyses:
  pta: cs:ci;implicit-entries:false;distinguish-string-constants:null;reflection-inference:solar;taint-config:java-benchmarks/ant-sast-for-tai-e/ant-taint-config.yml; #dump-ci:true;
onlyGenPlan: false
keepResult:
  - $KEEP-ALL
"""
    return options_yml_content

def organize_java_files(directory):
    # 遍历指定目录中的所有文件
    for root, dirs, files in os.walk(directory):
        for file in files:
            # 仅处理 .java 文件
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                # 获取文件名（不含扩展名）
                file_name = os.path.splitext(file)[0]
                # 取文件名的后5位作为目录名
                dir_name = file_name[-5:]
                # 目标目录路径
                target_dir = os.path.join(root, dir_name)
                # 创建目标目录（如果不存在）
                os.makedirs(target_dir, exist_ok=True)
                # 移动 .java 文件到目标目录
                shutil.move(file_path, os.path.join(target_dir, file))
                # 创建 options.yml 文件内容
                content_file_path = target_dir.replace("\\", "/").replace(".", "java-benchmarks/ant-sast-for-tai-e/ant-sast/completeness/base/chain/taintKind")
                options_yml_content = create_options_yml(content_file_path, file_name)

                # 写入 options.yml 文件
                with open(os.path.join(target_dir, 'options.yml'), 'w') as f:
                    f.write(options_yml_content)

# 指定要处理的目录
directory = '.'
organize_java_files(directory)

workspace(name = "bazel_windows_source_forest_creation_issue")

load("@bazel_tools//tools/build_defs/repo:java.bzl", "java_import_external")

java_import_external(
    name = "org_slf4j_slf4j_api",
    licenses = ["notice"],
    jar_urls = [
        "https://jcenter.bintray.com/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar",
    ],
    jar_sha256 = "18c4a0095d5c1da6b817592e767bb23d29dd2f560ad74df75ff3961dbde25b79",
    srcjar_urls = [
        "https://jcenter.bintray.com/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25-sources.jar",
    ],
    srcjar_sha256 = "c4bc93180a4f0aceec3b057a2514abe04a79f06c174bbed910a2afb227b79366",
)

java_import_external(
    name = "org_projectlombok_lombok",
    licenses = ["notice"],
    jar_urls = [
        "https://jcenter.bintray.com/org/projectlombok/lombok/1.18.2/lombok-1.18.2.jar",
    ],
    jar_sha256 = "f13db210efa2092a58bb7befce58ffa502e5fefc5e1099f45007074008756bc0",
    srcjar_urls = [
        "https://jcenter.bintray.com/org/projectlombok/lombok/1.18.2/lombok-1.18.2-sources.jar",
    ],
    srcjar_sha256 = "48922643ca1f975dd315176461fcabf7b2f440891e4cebbfd123aa0bb8d50129",
    generated_rule_name = "_lombok_lib",
    extra_build_file_content= """
java_plugin(
    name = "_lombok_plugin",
    generates_api = True,
    processor_class = "lombok.launch.AnnotationProcessorHider$AnnotationProcessor",
    deps = [":_lombok_lib"],
)

java_library(
    name = "org_projectlombok_lombok",
    exported_plugins = [":_lombok_plugin"],
    neverlink = True,
    visibility = ["//visibility:public"],
    exports = [":_lombok_lib"],
)
"""
)
